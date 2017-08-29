# Leiningen Commands

Create a new project

    lein new app <project_name>
    
Run the project

    lein run
    
Build the executable    

    lein uberjar
    
Launch the executable

    java -jar target/uberjar/<project_name>.jar
    
To start a REPL

    lein repl
        
# Leiningen Project Layout

* `/project.clj`
    * configuration file for Leiningen. 
    It helps Leiningen answer such questions as 
    "What dependencies does this project have?" 
    and "When this Clojure program runs, 
    what function should run first?"
* `src/<project_name>/core.clj`
    * usual main file
* `src/<project_name>/test/`
    * test files
* `src/<project_name>/resources/`
    * static assets

# Basic Functions

## Math operations

    (+ 1 2 3 4) => 10
    (* 1 2 3 4) => 24
    
## Output, Strings

Types & Things

    "Hello" => "Hello"

Basic output

    (println "Hello World") => nil
    
Concatenation

    (str "hello" " " "world") => "hello world"
    (str "#" 1)               => "#1"
    (str 1 "#")               => "1#"
    (str 4 2)                 => "42"
    
If Then Else

    (if (> 5 2) "bigger" "smaller") => "bigger"
    (if (< 5 2) "bigger" "smaller") => "smaller"
    (if (< 5 2) "bigger") => nil
    
Blocks
    
    (do form1 form2 ... formN) => formN
    
    (do "1st" "2nd" true false) => false
    
    (when true
        (println "Success!")
        "abra cadabra") => "abra cadabra"   
        
    (when false
        (println "Success!")
        "abra cadabra") => nil
        
Functions

    (nil? 1)  => false
    (nil? nil) => true
    (nil? true) => false
    (nil? false) => false
    
Logic

    (or term1 term2 term3) => first truthy value or last

    (or (= 1 1) (> 4 7)) => true
    (or (= 3 4) "hello") => "hello"
    
    (and term1 term1) => first falsey value or last truthy
    
Assign

    (def myarr ["a" "b" "c"]) => #'tutorial-clojure.core/myarr
    myarr => ["a" "b" "c"]

    