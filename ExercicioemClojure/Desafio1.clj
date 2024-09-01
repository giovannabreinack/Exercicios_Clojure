(defn usandoMap [p L]
  (if (empty? L)
    '()  
    (cons (p (first L)) (usandoMap p (rest L)))))
(println (usandoMap (fn [x] (+ x 2)) [30 25 6 7 2 1 0])) 