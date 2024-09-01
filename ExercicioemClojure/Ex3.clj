(defn max2 [L max]
  (if (empty? L)
    max
    (let [current (first L)]
      (if (> current max)
        (max2 (rest L) current)
        (max2 (rest L) max)))))

(defn maiorElemento [L]
  (if (empty? L)
    (throw (IllegalArgumentException. "A lista está vazia"))
    (max2 (rest L) (first L))))

(println (maiorElemento [3 1 4 1 5 9 2 6 5 17 11]))