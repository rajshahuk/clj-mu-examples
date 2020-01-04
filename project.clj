(defproject clj-mu-examples "0.1.0-SNAPSHOT"
  :description "examples for using https://github.com/rajshahuk/clj-mu"
  :url "https://github.com/rajshahuk/clj-mu-examples"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [com.twelvenines/clj-mu "0.0.3"]]
  :main ^:skip-aot clj-mu-examples.example-one
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
