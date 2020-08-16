(ns calculator.core)
(require '[clojure.string :as str])

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

(defn division
"returns division"
[a, b]
(/ a b))

(defn -main
  "I can say 'Hello World'."
  []
  (println "Simple calculator")
  (doseq [ln (line-seq (java.io.BufferedReader. *in*))]
   (println (str/split ln #" "))))