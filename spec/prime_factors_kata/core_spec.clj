(ns prime-factors-kata.core-spec
  (:require [speclj.core :refer :all]
            [prime-factors-kata.core :refer :all]))

(describe "primes-of"
  (it "returns [] for 1"
    (should= [] (primes-of 1)))

  (it "returns [2] for 2"
    (should= [2] (primes-of 2)))

  (it "returns [3] for 3"
    (should= [3] (primes-of 3)))

  (it "returns [2 2] for 4"
    (should= [2 2] (primes-of 4)))

  (it "returns [2 3] for 6"
    (should= [2 3] (primes-of 6)))

  (it "returns [2 2 2] for 8"
    (should= [2 2 2] (primes-of 8)))

  (it "returns [3 3] for 9"
    (should= [3 3] (primes-of 9)))

  (it "returns [2 2 3 3 7 17 19] for (2*2*3*3*7*17*19"
    (should= [2 2 3 3 7 17 19] (primes-of (reduce * '(2 2 3 3 7 17 19))))))
