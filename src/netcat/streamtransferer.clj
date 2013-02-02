(ns netcat.streamtransferer)

(defn stream-transferer
   "Generic stream data transferer."
   [input output]
   (let [reader input
         writer output]
      (try (loop [line (.readLine reader)]
              (when (not (nil? line))
                 (do (.println writer line)
                     (.flush writer)
                     (recur (.readLine reader)))))
           (finally (.close reader) (.close writer)))))

