(defn contagemdeElementos [L]
  (if (empty? L)
    0
    (+ 1 (contagemdeElementos (rest L)))))

(defn elementos [L]
  (contagemdeElementos L))
(println (elementos [ 2 3 5 7 7 8 1 2 2 4]))  
   
