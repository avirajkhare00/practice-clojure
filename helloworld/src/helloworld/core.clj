(ns helloworld.core)

(def name "Aviraj Khare")
(def some_list (list 1 2 3 4))
(def some_set (set [1 1 2 3 4]))

(defn add
"Returns sum of given two numbers"
[a, b]
(+ a b))

(defn -main
  "I can say 'Hello World'."
  []
  (println "Hello world! My name is")
  (println name)
  (println (+ 1 2 3 4 5))
  (if true
  (do (println "Success!"))
  (do (println "Failure!")))
  (println some_list)
  (println some_set)
  (println (add 2 3)))