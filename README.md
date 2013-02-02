netcat
======

Clojure implementation of NetCat

## Installation

Download from https://github.com/dboolbe/netcat/archive/master.zip.

## Usage

    $ java -jar netcat-0.1.0-standalone.jar [OPTIONS]

Similar to NetCat, the utility can be ran in Server Mode:

    $ java -jar netcat-0.1.0-standalone.jar -l -p [PORT]

Also like NetCat, the utility can be ran in Client Mode:

    $ java -jar netcat-0.1.0-standalone.jar -h [HOSTNAME] -p [PORT]

## Options

 --help             Show Help 
 -h, --host         Hostname 
 -p, --port         Port      
 -v, --verbose      Verbose   
 -l, --listen       Listen Mode

## Examples

String contain can be stream from one instance of the utility to another instance. On the server side, run the following command:

    $ java -jar netcat-0.1.0-standalone.jar -l -p [PORT]

On the client side, run the following command:

    $ java -jar netcat-0.1.0-standalone.jar -h [HOSTNAME] -p [PORT]

And type in the line you want to transmit, followed by [ENTER] when you are ready to send it. Strings can also be piped into it:

    $ [AUX PROGRAM] | java -jar netcat-0.1.0-standalone.jar -h [HOSTNAME] -p [PORT]

### Bugs

...

## License

Copyright © 2013 theSyndicate

Distributed under the Eclipse Public License, the same as Clojure.
