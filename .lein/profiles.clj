{:user {:plugins [[lein-ancient "0.6.8"]
                  [lein-auto "0.1.2"]
                  [lein-pprint "1.1.2"]
                  [lein-bikeshed "0.3.0"]]
        :dependencies [[slamhound "1.5.5"]
                       [pjstadig/humane-test-output "0.7.1"]]
        :injections [(require 'pjstadig.humane-test-output)
                     (pjstadig.humane-test-output/activate!)]}
 :repl {:plugins [[cider/cider-nrepl "0.12.0-SNAPSHOT"]
                  [refactor-nrepl "2.2.0-SNAPSHOT"]]
        :dependencies [[org.clojure/tools.nrepl "0.2.12"]]}}
