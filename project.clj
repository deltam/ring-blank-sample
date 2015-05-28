(defproject ring-blank-sample "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.9.4"]]
  :ring {:handler ring-blank-sample.core/handler
         :nrepl {:start? true
                 :host "0.0.0.0"
                 :port (Integer/parseInt (System/getenv "LEIN_REPL_PORT"))}}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring/ring-core "1.3.2"]
                 [ring/ring-jetty-adapter "1.3.2"]])
