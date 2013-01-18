(ns my-pallet.core
  (:require pallet.compute
            [pallet.compute.node-list :as node]
            [pallet.action.package :as package]
            pallet.core
            pallet.configure
            pallet.action.exec-script))


(def image "us-east-1/fdea06b0-3f24-11e2-ac50-0b645575ce9d")

(comment (def my-data-center
   (pallet.compute/compute-service
    "node-list"
    :node-list [(node/make-node "smartos1" "smartos-machines" "192.168.1.33" :smartos)])))

(defn play-with-packages
  "Function to play with pkgin and see if it really works"
  [session]
  (->
   session
   (package/packages :pkgin ["zsh"])))

(def test-server
  (pallet.core/group-spec "smartos-machines"
                          :count 1
                          :packager :pkgin
                          :node-spec (pallet.core/node-spec
                                      :image {:image-id image
                                           ;   :os-family  :smartos
                                              }
                                    ;  :location {:location-id "us-east-1"}
                                      :hardware {:smallest true}
                                      :network {:inbound-ports [22]})
                          ;:phases {:configure play-with-packages}
                          ))

(defn my-converge []  (pallet.core/converge test-server :compute (pallet.compute/service
                                                 :joyent-service)))

;; Commented out for now
(comment (pallet.core/lift
  (pallet.core/group-spec
   "smartos-machines"
   :phases {:configure play-with-packages})
  :compute my-data-center
  :user (pallet.utils/make-user "root")))

