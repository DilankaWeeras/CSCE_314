					;File: SchemeFlipped3.scm
					;Written by : Dilanka Weerasinghe
					;Date: 6/6/20
					;Tamu Email: dweerasinghe@tamu.edu
					;Class: CSCE 314
					;Description: make a function that will ID the datatype.

(define (typeID var)
	(cond
		[(integer? var) "Integer\n"]
		[(number? var) "Float\n"]
		[(string? var) "String\n"]
		[(boolean? var) "Bool\n"]
	)
)

(define (main)
    (display (typeID 14.5))
    (display (typeID #t))
    (display (typeID 14))
	(display (typeID "Hello"))
)

(main)