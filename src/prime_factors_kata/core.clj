(ns prime-factors-kata.core)

(defn primes-of [number]
  (loop [n number factor 2 result []]
    (if (< n factor)
      result
    (if (= 0 (mod n factor))
      (recur (/ n factor) factor (conj result factor))
      (recur n (inc factor) result)))))
