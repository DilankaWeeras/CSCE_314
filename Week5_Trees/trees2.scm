(define (leaf? node) ; checks if the child node is empty
  (null? (children node)))

(define (datum node)  ; datum is the data
  (car node))         ; getting the first car will give the data
                      ; the next two are the leaves

(define (children node) ; cdr is everything after the datum-data
  (cdr node))           ; this will return the child leaf

(define (count-leaves tree) ;
  (if (leaf? tree)
      1
      (count-leaves-in-forest (children tree))
  )
)

(define (count-leaves-in-forest forest)
  (if (null? forest)
      0
      (+ (count-leaves (car forest))
         (count-leaves-in-forest (cdr forest)))
  )
)

(define (make-node datum children)
  (cons datum children))

(define (leaf datum)
  (make-node datum '())
)

(define (cities name-list)
  (map leaf name-list)
)

(define (in-tree? place tree)
  (or (equal? place (datum tree))
      (in-forest? place (children tree))
  )
)

(define (in-forest? place forest)
  (if (null? forest)
      #f
      (or (in-tree? place (car forest))
	    (in-forest? place (cdr forest)))
  )
)

(define (locate city tree)
  (if (equal? city (datum tree))
      (list city)
      (let ((subpath (locate-in-forest city (children tree))))
        (if subpath
            (cons (datum tree) subpath)
            #f))))

(define (locate-in-forest city forest)
  (if (null? forest)
      #f
      (or (locate city (car forest))
	  (locate-in-forest city (cdr forest)))))

(define (far-left tree)
  (cond
  ((leaf? tree) (datum tree))
  ((not leaf? tree) (far-left (children tree)))
  )
)

(define world-tree2
  (make-node
   'world
   (list (make-node
          'italy
          (cities '(venezia riomaggiore firenze roma)))
         (make-node
          '(united states)
          (list (make-node
                 'california
                 (cities '(berkeley (san francisco) gilroy)))
                (make-node
                 'massachusetts
                 (cities '(cambridge amherst sudbury)))
                (make-node 
                 'ohio 
                 (cities '(kent)))))
         (make-node 'zimbabwe 
            (cities '(harare hwange)))
         (make-node 'china
		        (cities '(beijing shanghai guangzhou suzhou)))
         (make-node
          '(great britain)
          (list 
           (make-node 'england 
                (cities '(liverpool)))
           (make-node 'scotland
		            (cities '(edinburgh glasgow (gretna green))))
           (make-node 'wales (cities '(abergavenny)))))
         (make-node
          'australia
          (list
           (make-node 'victoria (cities '(melbourne)))
           (make-node '(new south wales) (cities '(sydney)))
           (make-node 'queensland
		            (cities '(cairns (port douglas))))))
         (make-node 'honduras (cities '(tegucigalpa))))))




; (count-leaves world-tree)
(display (count-leaves world-tree2))
(newline)

;> (in-tree? 'abergavenny world-tree)
(display (in-tree? 'abergavenny world-tree2))
(newline)
;#T

;> (in-tree? 'abbenay world-tree)
(display (in-tree? 'abbenay world-tree2))
(newline)
;#F

;> (in-tree? 'venezia (cadr (children world-tree)))
(display (in-tree? 'venezia (cadr (children world-tree2))))
(newline)
;#F

;> display the world
(display (datum world-tree2))
(newline)
;--The first part of the list of worldtree2 is defined as the world

;> display italy
(display (datum (car (children world-tree2))))
(newline)
;--Navigation
;   go to child
;   get the first child
;   get the data from that child

;> display california
(display (datum (car (children (cadr (children world-tree2))))))
(newline)
;--Navigation
;   go to child - children
;   second in list of children - cadr
;   go to child - children
;   first in list of children - car
;   get the data - datum

(display (far-left(world-tree2)))
(newline)

