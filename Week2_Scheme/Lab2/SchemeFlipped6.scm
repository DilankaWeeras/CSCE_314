					;File: SchemeFlipped6.scm
					;Written by : Dilanka Weerasinghe
					;Date: 6/6/20
					;Tamu Email: dweerasinghe@tamu.edu
					;Class: CSCE 314
					;Description: Prints the letter grade from the number grade


(define (grade x)
    (cond
        [(< x 60) (display "Failed\n")]
        [(< x 70) (display "Grade : D\n")]
        [(< x 80) (display "Grade : C\n")]
        [(< x 90) (display "Grade : B\n")]
        [(<= x 100) (display "Grade : A\n")]
        [else (display "Grade is not availible.\n")]
    )
)

(define (main)
    (grade 57)
    (grade 61)
    (grade 78)
    (grade 91)
    (grade 100)
    (grade 80)
    (grade 200)
)

(main)