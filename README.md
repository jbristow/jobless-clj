# jobless-clj

Jobless is a simple DSL written in Clojure for generating CVs.

It is a complete clojure rewrite of [dabrorious](https://github.com/dabrorius)/[jobless](https://github.com/dabrorius/jobless). If you like it, give him all the credit because I'm just exploring the fact that ruby is pretty much a lisp sometimes.

## Installation

Use clojars to pull it in via Leiningen dependencies:

[![Clojars Project](http://clojars.org/jobless-clj/latest-version.svg)](http://clojars.org/jobless-clj)
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Fjbristow%2Fjobless-clj.svg?type=shield)](https://app.fossa.io/projects/git%2Bgithub.com%2Fjbristow%2Fjobless-clj?ref=badge_shield)

then include it in your clj:

```
(ns jobless-clj.example 
  (:require [jobless-clj.core :refer :all]))
```

## Demonstration

It generates HTML files, which can be easily converted to PDF format if needed. Here's an example of Jobless code.

```
(cv 
  (cv-name "John Doe")
  (email "john.doe@gmail.com")
  (employment
    (entry
      (title "Full-stack Clojure Developer")
      (company "Democratic Programming Guard")
      (start-date "April 2015")
      (end-date "June 2015"))
    (entry 
      (title "C# Developer") 
      (company "Microsoft")
      (start-date "January 2015")
      (end-date "April 2015"))))
```

You can see a larger source example [here](https://github.com/jbristow/jobless-clj/blob/master/src/jobless_clj/example.clj) which gets compiled into [this](http://jbristow.github.io/jobless-clj/jbristow.html).

## Available keywords

### Personal info

The following keywords are available on top level:

* cv-name *(name is a reserved symbol in clojure)*
* css *(set to the contents of resources/style.css by default)*
* email
* location
* address
* homepage

### Groups and entries

A key part of a CV are lists of your archievements grouped in different categories. You can add groups to your CV with group keyword. Each group consists of multiple entries.

```
(group
  (entry 
    (item "some item")))
```

For your convenience, jobless provides several groups with pre-defined titles.

* employment
* education
* open-source 
* other-exp

```
(education
  (entry
    (title "Clojure Course")))
```

You can also define new groups using the `cv-group` macro.

```
(cv-group "example-group" "Printable Group Title")
```
becomes:
```
(example-group (entry (email "some@email.nothing")))
```

### Entry

An entry is an element of an entry in a group. The title of an open source project, the website of an employer. The following keywords are available for each entry.

* title
* company
* homepage
* technologies
* description
* start_date
* end_date

They can also have multiple `bulletin` elements, each of which will be rendered as one bulleted item in a list.


## License
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Fjbristow%2Fjobless-clj.svg?type=large)](https://app.fossa.io/projects/git%2Bgithub.com%2Fjbristow%2Fjobless-clj?ref=badge_large)