(ns helloworld.core)

(def name "Aviraj Khare")
(def some_list (list 1 2 3 4))
(def some_set (set [1 1 2 3 4]))

(defn add
"Returns sum of given two numbers"
[a, b]
(+ a b))

(defn subtract
"Returns subtraction of two numbers"
[a, b]
(- a b))

(defn multiply
"returns product of two numbers"
[a, b]
(* a b))

(defn condtn
"More complex function"
[x]
(if (> x 10)
"this is a big number"
"this is not so big number")
)

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
  (println (add 2 3))
  (println (subtract 10 5))
  (println (multiply 10 6))
  (println (condtn 11))
  (println (condtn 5))
  (map (fn [full_name] (println(full_name))
     ["Darth Vader" "Mr. Magoo"])))