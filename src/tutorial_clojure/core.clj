; this is a comment
(ns tutorial-clojure.core (:gen-class))

(defn wisdom
  [words]
  (str words, ", Daniel San"))

(defn overloaded-fn
  ([arg1] (println (str "1-arg" arg1)))
  ([arg1 arg2] (println (str "2-arg" arg1 arg2)))
  ([arg1 arg2 arg3 arg4] (println (str "4-arg" arg1 arg2 arg3 arg4)))
  )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (do
    (println "Hello, World!")
    (println  (wisdom "That's life"))
    (println  (overloaded-fn "1"))
    (println  (overloaded-fn "1" "2"))
    (println  (overloaded-fn "1" "2" "3" "4"))
))