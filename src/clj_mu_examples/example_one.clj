(ns clj-mu-examples.example-one
  (:require [clj-mu.core :refer :all]
            [clojure.tools.logging :as log])
  (:gen-class))

(defn -main
  "Basic webserver..."
  [& args]
  (let [mu-builder (configure-mu {:port 8080
                                  :https-port 8443})
        mu-server (-> mu-builder
                      (STATIC "resources/www" "www")
                      (GET "/helloworld" (fn [request] {:status 200 :body "Hello, World!"}))
                      (start-mu))]

    (do
      (log/info "mu-server started at:" (.toString (.uri mu-server))))
    ))
