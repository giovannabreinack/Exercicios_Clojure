(defn usandoFilter [pred L]
  (cond
    (empty? L) '()  
    (pred (first L)) (cons (first L) (usandoFilter pred (rest L)))  
    :else (usandoFilter pred (rest L)))) 

(defn elementos [pred L]
  (usandoFilter pred L))
(println (elementos (fn [x] (> x 9)) [9 2 3 11 0 34 87 10 1]))  