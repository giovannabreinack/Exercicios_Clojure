(defn concatenacaodeListas[L1 L2]
  (if (empty? L1)
    L2  
    (cons (first L1) (concatenacaodeListas (rest L1) L2))))  
(defn elementos [L1 L2]
  (concatenacaodeListas L1 L2))
(println (elementos [3 0 0 6] [2 0 0 2]))