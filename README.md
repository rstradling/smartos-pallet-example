# my-pallet

A Clojure example designed to show you how to use pallet 0.7.3 with Joyent 
with SmartOS.  

## Usage

You will need to set up your ~/.pallet/config.clj file correctly.

```clojure
(defpallet
  :services
  {:joyent-service
   {:provider "joyent-cloudapi" :identity <identity> :credential <password>
    :jclouds.zones "us-east-1"
    :endpoint "https://api.joyentcloud.com"
    :environment
    {:user {:username "root"
            :private-key-path <private key>
            :public-key-path <public key>}}}})
```

Then follow the code in the source file.

## License

Copyright © 2013 Ryan Stradling 

Distributed under the Eclipse Public License, the same as Clojure.
