Token: IDENTIFICADOR -> class
Token: IDENTIFICADOR -> Empregado
Token: ABRE_CHAVES -> {
Token: RESERVADA -> string
Token: IDENTIFICADOR -> cpf
Token: IDENTIFICADOR -> nome
Token: PONTO_E_VIRGULA -> ;
Token: RESERVADA -> int
Token: IDENTIFICADOR -> salario
Token: PONTO_E_VIRGULA -> ;
Token: RESERVADA -> constructor
Token: ABRE_PARENTESES -> (
Token: RESERVADA -> string
Token: IDENTIFICADOR -> a
Token: RESERVADA -> string
Token: IDENTIFICADOR -> b
Token: RESERVADA -> int
Token: IDENTIFICADOR -> c
Token: FECHA_PARENTESES -> )
Token: ABRE_CHAVES -> {
Token: IDENTIFICADOR -> cpf
Token: ATRIBUICAO -> =
Token: IDENTIFICADOR -> a
Token: PONTO_E_VIRGULA -> ;
Token: IDENTIFICADOR -> nome
Token: ATRIBUICAO -> =
Token: IDENTIFICADOR -> b
Token: PONTO_E_VIRGULA -> ;
Token: IDENTIFICADOR -> salario
Token: ATRIBUICAO -> =
Token: IDENTIFICADOR -> c
Token: PONTO_E_VIRGULA -> ;
Token: FECHA_CHAVES -> }
Token: RESERVADA -> string
Token: IDENTIFICADOR -> getNome
Token: ABRE_PARENTESES -> (
Token: FECHA_PARENTESES -> )
Token: ABRE_CHAVES -> {
Token: RESERVADA -> return
Token: IDENTIFICADOR -> nome
Token: PONTO_E_VIRGULA -> ;
Token: FECHA_CHAVES -> }
Token: RESERVADA -> string
Token: IDENTIFICADOR -> setNome
Token: ABRE_PARENTESES -> (
Token: RESERVADA -> string
Token: IDENTIFICADOR -> n
Token: FECHA_PARENTESES -> )
Token: ABRE_CHAVES -> {
Token: IDENTIFICADOR -> nome
Token: ATRIBUICAO -> =
Token: IDENTIFICADOR -> n
Token: PONTO_E_VIRGULA -> ;
Token: RESERVADA -> return
Token: IDENTIFICADOR -> nome
Token: PONTO_E_VIRGULA -> ;
Token: FECHA_CHAVES -> }
Token: RESERVADA -> string
Token: IDENTIFICADOR -> getCpf
Token: ABRE_PARENTESES -> (
Token: FECHA_PARENTESES -> )
Token: ABRE_CHAVES -> {
Token: RESERVADA -> return
Token: IDENTIFICADOR -> cpf
Token: PONTO_E_VIRGULA -> ;
Token: FECHA_CHAVES -> }
Token: RESERVADA -> string
Token: IDENTIFICADOR -> setCpf
Token: ABRE_PARENTESES -> (
Token: RESERVADA -> string
Token: IDENTIFICADOR -> c
Token: FECHA_PARENTESES -> )
Token: ABRE_CHAVES -> {
Token: IDENTIFICADOR -> cpf
Token: ATRIBUICAO -> =
Token: IDENTIFICADOR -> c
Token: PONTO_E_VIRGULA -> ;
Token: RESERVADA -> return
Token: IDENTIFICADOR -> cpf
Token: PONTO_E_VIRGULA -> ;
Token: FECHA_CHAVES -> }
Token: RESERVADA -> int
Token: IDENTIFICADOR -> getSalario
Token: ABRE_PARENTESES -> (
Token: FECHA_PARENTESES -> )
Token: ABRE_CHAVES -> {
Token: RESERVADA -> return
Token: IDENTIFICADOR -> salario
Token: PONTO_E_VIRGULA -> ;
Token: FECHA_CHAVES -> }
Token: RESERVADA -> int
Token: IDENTIFICADOR -> setSalario
Token: ABRE_PARENTESES -> (
Token: RESERVADA -> int
Token: IDENTIFICADOR -> s
Token: FECHA_PARENTESES -> )
Token: ABRE_CHAVES -> {
Token: RESERVADA -> if
Token: ABRE_PARENTESES -> (
Token: IDENTIFICADOR -> s
Token: MENOR -> <
Token: INT_CONSTANTE -> 0
Token: FECHA_PARENTESES -> )
Token: ABRE_CHAVES -> {
Token: RESERVADA -> return
Token: INT_CONSTANTE -> 0
Token: PONTO_E_VIRGULA -> ;
Token: FECHA_CHAVES -> }
Token: IDENTIFICADOR -> salario
Token: ATRIBUICAO -> =
Token: IDENTIFICADOR -> s
Token: PONTO_E_VIRGULA -> ;
Token: RESERVADA -> return
Token: IDENTIFICADOR -> salario
Token: PONTO_E_VIRGULA -> ;
Token: FECHA_CHAVES -> }
Token: FECHA_CHAVES -> }
Token: IDENTIFICADOR -> class
Token: IDENTIFICADOR -> Main
Token: ABRE_CHAVES -> {
Token: IDENTIFICADOR -> Empregado
Token: IDENTIFICADOR -> emp
Token: PONTO_E_VIRGULA -> ;
Token: RESERVADA -> int
Token: IDENTIFICADOR -> darAumento
Token: ABRE_PARENTESES -> (
Token: FECHA_PARENTESES -> )
Token: ABRE_CHAVES -> {
Token: IDENTIFICADOR -> emp
Token: ATRIBUICAO -> =
Token: RESERVADA -> new
Token: IDENTIFICADOR -> Empregado
Token: ABRE_PARENTESES -> (
Token: STRING_CONSTANTE -> "Fulano","12345678"
Token: INT_CONSTANTE -> 100
Token: FECHA_PARENTESES -> )
Token: PONTO_E_VIRGULA -> ;
Token: RESERVADA -> int
Token: IDENTIFICADOR -> salario
Token: PONTO_E_VIRGULA -> ;
Token: IDENTIFICADOR -> salario
Token: ATRIBUICAO -> =
Token: IDENTIFICADOR -> emp
Token: PONTO -> .
Token: IDENTIFICADOR -> getSalario
Token: ABRE_PARENTESES -> (
Token: FECHA_PARENTESES -> )
Token: PONTO_E_VIRGULA -> ;
Token: RESERVADA -> int
Token: IDENTIFICADOR -> vintePorCento
Token: PONTO_E_VIRGULA -> ;
Token: IDENTIFICADOR -> vintePorCento
Token: ATRIBUICAO -> =
Token: IDENTIFICADOR -> salario
Token: MULTIPLICACAO -> *
Token: INT_CONSTANTE -> 20
Token: DIVISAO -> /
Token: INT_CONSTANTE -> 100
Token: PONTO_E_VIRGULA -> ;
Token: RESERVADA -> int
Token: IDENTIFICADOR -> salarioNovo
Token: PONTO_E_VIRGULA -> ;
Token: IDENTIFICADOR -> salarioNovo
Token: ATRIBUICAO -> =
Token: IDENTIFICADOR -> salario
Token: SOMA -> +
Token: IDENTIFICADOR -> vintePorCento
Token: PONTO_E_VIRGULA -> ;
Token: IDENTIFICADOR -> emp
Token: PONTO -> .
Token: IDENTIFICADOR -> setSalario
Token: ABRE_PARENTESES -> (
Token: IDENTIFICADOR -> salarioNovo
Token: FECHA_PARENTESES -> )
Token: PONTO_E_VIRGULA -> ;
Token: RESERVADA -> return
Token: IDENTIFICADOR -> salarioNovo
Token: PONTO_E_VIRGULA -> ;
Token: FECHA_CHAVES -> }
Token: FECHA_CHAVES -> }