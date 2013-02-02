(defproject pallet-smartos-example "0.1.0-SNAPSHOT"
  :description "Smart-os testing"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.cloudhoist/pallet "0.7.3-smartos-SNAPSHOT"]
                 [org.cloudhoist/pallet-jclouds "1.5.1"]
                 [org.jclouds/jclouds-compute "1.5.6-SNAPSHOT"]
                 [org.jclouds.labs/joyent-cloudapi "1.5.6-SNAPSHOT"]
                 [org.jclouds.labs/joyentcloud "1.5.6-SNAPSHOT"]
                 [org.slf4j/slf4j-api "1.6.1"]
                 [org.jclouds.driver/jclouds-sshj "1.5.6-SNAPSHOT"]
                 [ch.qos.logback/logback-core "1.0.0"]
                 [ch.qos.logback/logback-classic "1.0.0"]
                 [com.jcraft/jsch "0.1.49"]]
  :repositories {"sonatype" "http://oss.sonatype.org/content/repositories/releases"
                 "sonatype-snapshots" "https://oss.sonatype.org/content/repositories/snapshots"})