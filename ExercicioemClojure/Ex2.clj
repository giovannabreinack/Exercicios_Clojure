;Ex 2
(def listaVazia [])
(def listaVazia [ 1 2 3 4 5])
(defn somarLista [L]
(if
    (empty? L) ; teste lógico
    0 ; if true
     (+
        (first L)
      (somarLista(rest L))
     )
     )
    )

(println (somarLista listaVazia))