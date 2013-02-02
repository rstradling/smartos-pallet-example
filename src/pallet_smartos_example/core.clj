(ns pallet-smartos-example.core
  (:require pallet.compute
            [pallet.compute.node-list :as node]
            [pallet.action.package :as package]
            pallet.core
            pallet.configure
            pallet.action.exec-script)
  (:import [org.jclouds.compute.domain NodeState OsFamily OperatingSystem]))


(def image "us-east-1/sdc:sdc:base64:1.8.4")

(comment (def my-data-center
   (pallet.compute/compute-service
    "node-list"
    :node-list [(node/make-node "smartos1" "smartos-machines" "" :smartos)])))

(defn play-with-packages
  "Function to play with pkgin and see if it really works"
  [session]
  (->
   session
   (package/packages :pkgin ["zsh"])))

(def with-play
  (pallet.core/server-spec
   :phases {:configure play-with-packages}
   ))

(def mynodes
  (pallet.core/node-spec
   :image {:image-id image
           :os-family :smartos
           }
   :location {:location-id "us-east-1"}
   :hardware {:smallest true}
   :network {:inbound-ports [22]}))

(def smartos-machines-group
  (pallet.core/group-spec "smartos-machines"
                          :extends [with-play]
                          :node-spec mynodes
                          :packager :pkgin))

(def my-compute-service (pallet.compute/service :joyent-service))

(defn my-converge []  (pallet.core/converge  {smartos-machines-group 1}
                                           :compute my-compute-service ))
