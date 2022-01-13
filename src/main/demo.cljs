(ns demo)

(println "hello")

(defn print-with-delay
  [delay]
  (let [timer-id (js/setTimeout
                  #(println "delayed" delay "ms") delay)]
    timer-id))

(defn print-to-maxdelay
  [maxdelay]
  (doseq [delay (range 1 maxdelay)]
    (print-with-delay delay)))

(defn -main
  [& args]
  (print-to-maxdelay 50)
  (println "hello from main" args))