(ns replik.core
  (:use [alex-and-georges.debug-repl :as debug-repl])
  (:gen-class))

(defn -main [& args]
  (let [x 1
        y 2]
    (debug-repl)))
