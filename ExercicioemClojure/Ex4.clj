(defn invertedor [L incrementar]
  (if (empty? L)
    incrementar
    (invertedor (rest L) (conj incrementar (first L)))))

(defn lista [L]
  (invertedor L '()))
(println (lista [4 6 7 9 3]))
