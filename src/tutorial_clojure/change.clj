(ns tutorial-clojure.change (:gen-class))

(def denominations [1 2 5 10 20 50 100 200 500 1000 2000 5000 10000 20000 50000] )

(defn mychange
  "calculates the possible set of changes"
  [amountArg]
  (+ 1 amountArg)
)

(defn generate-possibilities
  [originalArr]
  (conj originalArr (get denominations 0)))

(defn -main
  [& args]

  (def original-amount 132)
  ;(println (str "Here's the change for " original-amount ": " (mychange original-amount)) )
  (println 1)
  (println 2)
  (println original-amount)
  (println (mychange original-amount))
  (println (generate-possibilities [100 100]))
  )