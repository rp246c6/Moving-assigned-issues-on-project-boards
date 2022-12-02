class Substitution {
 static void main(args){
 // These are normal strings
def name_1 = 'Steve'
def confirmation_1 = '2 message(s) sent to ' + name_1
println "confirmation:"+confirmation_1
// The confirmation variable is a string with substitution expressions
def name = 'Steve'
def numMessages = 2
def confirmation = "${numMessages} message(s) sent to ${name}"
println ("confirmation:"+confirmation)
   }
}
