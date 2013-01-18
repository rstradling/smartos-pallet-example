(defproject my-pallet "0.1.0-SNAPSHOT"
  :description "Smart-os testing"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.cloudhoist/pallet "0.7.3-STRAD"]
                 [org.cloudhoist/pallet-jclouds "1.5.1"]               ; [org.cloudhoist/pallet-crates-standalone “0.5.0”]
                 [org.jclouds/jclouds-compute "1.5.5"]
                 [org.jclouds.labs/joyent-cloudapi "1.5.5"]
                 [org.jclouds.labs/joyentcloud "1.5.5"]
                 [org.jclouds/jclouds-all "1.5.5"]
                 [org.slf4j/slf4j-api "1.6.1"]
                 [ch.qos.logback/logback-core "1.0.0"]
                 [ch.qos.logback/logback-classic "1.0.0"]
                 [org.jclouds.driver/jclouds-jsch "1.5.5"]
               ]
  :repositories {"sonatype" "http://oss.sonatype.org/content/repositories/releases"})