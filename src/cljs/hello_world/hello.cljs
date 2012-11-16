(ns hello-world.hello
  (:require [clojure.browser.repl :as repl])
  (:use [jayq.core :only [$ bind]]))

(defn log [msg] (.log js/console msg))

;(bind ($ "button") :click
;  #(doseq [key (js-keys %)]
;    (log key)))

;(repl/connect "http://localhost:9000/repl")