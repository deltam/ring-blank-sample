(ns ring-blank-sample.core
  (:use [ring.adapter.jetty]))

(def word (atom ""))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (str "Hello! " @word)})

;(defn -main []
;  (run-jetty handler {:port 8088}))
