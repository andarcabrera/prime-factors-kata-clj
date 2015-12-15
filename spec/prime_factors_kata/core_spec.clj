(ns prime-factors-kata.core-spec
  (:require [speclj.core :refer :all]
            [prime-factors-kata.core :refer :all]))

(describe "primes-of"
  (it "returns [2] for 2"
    (should= [2] (primes-of 2))))
