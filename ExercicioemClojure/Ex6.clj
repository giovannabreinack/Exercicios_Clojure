(defn dobradeElementos [L]
  (if (empty? L)
    '()  
    (cons (* 2 (first L)) (dobradeElementos (rest L)))))

(defn elementos [L]
  (dobradeElementos L))
(println (elementos [5 3 6 8 2 1 0 2])) 

