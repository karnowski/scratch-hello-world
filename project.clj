(defproject hello-world "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.0-beta1"]
                 [org.clojure/clojurescript "0.0-1535"]
                 [compojure "1.1.3"]
                 [ring/ring-jetty-adapter "1.1.6"]
                 [org.clojure/google-closure-library "0.0-1376-2"]
                 #_[jayq "0.2.0"]]
  :source-paths ["src/clj"]
  :plugins [[lein-cljsbuild "0.2.9"]]
  :cljsbuild {
    :builds [{
      :source-path "src/cljs"
      :compiler {
        :output-to "resources/public/hello.js"
        ;:externs ["externs/jquery.js"]
        :optimizations :whitespace
        :pretty-print true }}]})