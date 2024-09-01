(defn quadradodosNumeros [n]
  (if (zero? n)
    '()  
    (let [resto (quadradodosNumeros(dec n))]  
      (if (even? n)
        (conj resto (* n n))  
        resto))))  

(defn elementos [n]
  (quadradodosNumeros n))
(println (elementos 6))  