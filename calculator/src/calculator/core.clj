(ns calculator.core)

(defn -main
  "I can say 'Hello World'."
  []
  (println "Simple calculator")
  (doseq [ln (line-seq (java.io.BufferedReader. *in*))]
   (println ln)))