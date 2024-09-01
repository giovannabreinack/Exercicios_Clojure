(defn filtrodePares [L]
  (cond
    (empty? L) '()
    (even? (first L)) (cons (first L) (filtrodePares (rest L))) 
    :else (filtrodePares(rest L))))  

(defn elementos [L]
  (filtrodePares L))
(println (elementos [10 3 4 8 5 9 1 32 11 81 90 16]))  