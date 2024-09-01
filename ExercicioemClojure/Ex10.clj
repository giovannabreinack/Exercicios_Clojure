(defn tabuada [n i]
  (if (> i n)
    '()  
    (cons [i (* i n)] (tabuada n (inc i)))))  

(defn elementos [n]
  (tabuada n 1))
(println (elementos 10)) 