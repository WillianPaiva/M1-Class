(TeX-add-style-hook
 "rappor"
 (lambda ()
   (TeX-add-to-alist 'LaTeX-provided-package-options
                     '(("color" "usenames" "dvipsnames") ("inputenc" "utf8") ("fontenc" "T1")))
   (add-to-list 'LaTeX-verbatim-environments-local "lstlisting")
   (add-to-list 'LaTeX-verbatim-macros-with-braces-local "lstinline")
   (add-to-list 'LaTeX-verbatim-macros-with-delims-local "lstinline")
   (TeX-run-style-hooks
    "latex2e"
    "article"
    "art10"
    "fancyhdr"
    "lastpage"
    "extramarks"
    "color"
    "graphicx"
    "listings"
    "courier"
    "lipsum"
    "inputenc"
    "fontenc"
    "lmodern"
    "verbatim")
   (TeX-add-symbols
    '("problemAnswer" 1)
    '("exitProblemHeader" 1)
    '("enterProblemHeader" 1)
    "homeworkProblemName"
    "homeworkSectionName"
    "hmwkTitle"
    "hmwkDueDate"
    "hmwkClass"
    "hmwkClassInstructor"
    "hmwkAuthorName")
   (LaTeX-add-environments
    '("homeworkProblem" LaTeX-env-args ["argument"] 0)
    '("homeworkSection" 1))
   (LaTeX-add-counters
    "homeworkProblemCounter")))

