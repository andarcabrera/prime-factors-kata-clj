(ns prime-factors-kata.core-spec
  (:require [speclj.core :refer :all]
            [prime-factors-kata.core :refer :all]))

(describe "primes-of"
  (it "returns [2] for 2"
    (should= [2] (primes-of 2)))

  (it "returns [3] for 3"
    (should= [3] (primes-of 3)))

  (it "returns [2 2] for 4"
    (should= [2 2] (primes-of 4)))

  (it "returns [2 3] for 6"
    (should= [2 3] (primes-of 6)))

  (it "returns [2 2 2] for 8"
    (should= [2 2 2] (primes-of 8))))
