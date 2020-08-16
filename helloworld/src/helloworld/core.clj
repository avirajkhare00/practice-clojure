(ns helloworld.core)

(def name "Aviraj Khare")
(def some_list (list 1 2 3 4))

(defn -main
  "I can say 'Hello World'."
  []
  (println "Hello world! My name is")
  (println name)
  (println (+ 1 2 3 4 5))
  (if false
  (do (println "Success!")
      "By Zeus's hammer!")
  (do (println "Failure!")
      "By Aquaman's trident!"))
  (println some_list))