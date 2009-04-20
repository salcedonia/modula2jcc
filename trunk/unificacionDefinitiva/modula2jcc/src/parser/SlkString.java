package parser;


// SlkString.java - generated by the SLK parser generator 

public class SlkString {

private static String[] Nonterminal_name ={"0"

,"UnidadDeCompilacion"
,"ModuloPrograma"
,"ModuloDefinicion"
,"ModuloImplementacion"
,"CabeceraModulo"
,"CabeceraDefinicion"
,"ListaImportados"
,"ListaExportados"
,"Prioridad"
,"Bloque"
,"DefinicionDeModulo"
,"ParteDeclarativa"
,"Declaracion"
,"DeclaracionDeConstantes"
,"AsociacionConstante"
,"DeclaracionDeTipos"
,"DefinicionDeTipo"
,"EsquemaDeTipo"
,"TipoSimple"
,"TipoEnumerado"
,"RestoDeTipo"
,"TipoConjunto"
,"TipoFormacion"
,"TipoRegistro"
,"SecuenciaDeListasDeCampos"
,"ListaDeCampos"
,"TipoPuntero"
,"TipoSubprograma"
,"ListaDeTiposFormales"
,"RetornoSubprograma"
,"DeclaracionDeVariables"
,"ListaDeVariables"
,"DeclaracionSubprograma"
,"CabeceraSubprograma"
,"ParametrosFormales"
,"GrupoDeParametros"
,"DeclaracionModulo"
,"ParteEjecutiva"
,"SecuenciaDeSentencias"
,"Sentencia"
,"SentenciaAsignacion"
,"RestoSentenciaAsignacion"
,"RestoSentenciaRestoAsignacion"
,"ParteIzquierda"
,"IdentificadorOProcPredef"
,"SentenciaIF"
,"RestoSentenciaIF"
,"SentenciaCASE"
,"Caso"
,"SentenciaWHILE"
,"SentenciaREPEAT"
,"SentenciaLOOP"
,"SentenciaFOR"
,"SentenciaWITH"
,"SentenciaRETURN"
,"ListaDeValores"
,"RestoListaValores"
,"Valores"
,"RestoValores"
,"ExpresionConstante"
,"ExpresionConstanteSimple"
,"TerminoConstante"
,"FactorConstante"
,"ParametrosDeLlamada"
,"ListaDeExpresiones"
,"RestoListaDeExpresiones"
,"Expresion"
,"RestoExpresion"
,"ExpresionSimple"
,"RestoExpresionSimple"
,"Signo"
,"Termino"
,"RestoTermino"
,"Factor"
,"RestoFactor"
,"OperadorComparador"
,"OperadorSumador"
,"OperadorMultiplicador"
,"OperadorUnario"
,"TipoFormal"
,"Numero"
,"ListaDeElementos"
,"Elementos"
,"IdentificadorDeTipo"
,"TipoPredefinido"
,"ConstantePredefinida"
,"ListaDeIdentificadores"
,"RestoListaIdentificadores"
,"IdentDeProc"
,"IdentDeProcPredef"
,"LlamadaProcedimientoPredefinido"
,"LlamadaFuncionPredefinida"
,"DefinicionDeModulo_*"
,"Prioridad_opt"
,"ListaImportados_;_*"
,"ListaImportados_;_2_*"
,"ListaExportados_;_opt"
,"FROM_Identificador_opt"
,",_IdentDeProc_*"
,"QUALIFIED_opt"
,"=_EsquemaDeTipo_opt"
,"Identificador_=_EsquemaDeTipo_opt_;_*"
,"Declaracion_*"
,"AsociacionConstante_;_*"
,"DefinicionDeTipo_;_*"
,",_TipoSimple_*"
,";_ListaDeCampos_*"
,"ListaDeTiposFormales_opt"
,"VAR_opt"
,"VAR_2_opt"
,",_VAR_2_opt_TipoFormal_*"
,"VAR_opt_TipoFormal_,_VAR_2_opt_TipoFormal_*_opt"
,"ListaDeVariables_;_*"
,"ParametrosFormales_opt"
,";_GrupoDeParametros_*"
,"GrupoDeParametros_;_GrupoDeParametros_*_opt"
,":_IdentificadorDeTipo_opt"
,"VAR_3_opt"
,"Prioridad_2_opt"
,"ListaImportados_;_3_*"
,"ListaExportados_;_2_opt"
,"BEGIN_SecuenciaDeSentencias_opt"
,";_Sentencia_*"
,"ELSIF_Expresion_THEN_SecuenciaDeSentencias_*"
,"ELSE_SecuenciaDeSentencias_opt"
,"|_Caso_*"
,"ELSE_SecuenciaDeSentencias_2_opt"
,"BY_ExpresionConstante_opt"
,"Expresion_opt"
,"OperadorComparador_ExpresionConstanteSimple_opt"
,"OperadorSumador_TerminoConstante_*"
,"OperadorMultiplicador_FactorConstante_*"
,"ListaDeExpresiones_opt"
,"ARRAY_OF_opt"
,",_Elementos_*"
,"Elementos_,_Elementos_*_opt"
,".._ExpresionConstante_opt"
,",_Expresion_opt"
,",_Expresion_2_opt"
,",_Expresion_3_opt"
};

private static String[] Terminal_name ={"0"

,"Identificador"
,"."
,"END"
,"IMPLEMENTATION"
,"MODULE"
,";"
,"DEFINITION"
,"FROM"
,"IMPORT"
,","
,"EXPORT"
,"QUALIFIED"
,"TYPE"
,"="
,"CONST"
,"["
,".."
,"]"
,"("
,")"
,"SET"
,"OF"
,"ARRAY"
,"RECORD"
,":"
,"POINTER"
,"TO"
,"PROCEDURE"
,"VAR"
,"BEGIN"
,"EXIT"
,":="
,"^"
,"IF"
,"THEN"
,"ELSIF"
,"ELSE"
,"CASE"
,"|"
,"WHILE"
,"DO"
,"REPEAT"
,"UNTIL"
,"LOOP"
,"FOR"
,"BY"
,"WITH"
,"RETURN"
,"Cadena"
,"Caracter"
,"+"
,"-"
,"{"
,"}"
,"<>"
,"#"
,"<"
,"<="
,">"
,">="
,"IN"
,"OR"
,"*"
,"/"
,"DIV"
,"MOD"
,"&"
,"AND"
,"NOT"
,"~"
,"NumeroEntero"
,"NumeroReal"
,"BITSET"
,"BOOLEAN"
,"CARDINAL"
,"CHAR"
,"INTEGER"
,"LONGINT"
,"LONGREAL"
,"PROC"
,"REAL"
,"TRUE"
,"FALSE"
,"NIL"
,"ALLOCATE"
,"DEALLOCATE"
,"ReadInt"
,"WriteInt"
,"ReadCard"
,"WriteCard"
,"ReadChar"
,"WriteChar"
,"ReadString"
,"WriteString"
,"ReadReal"
,"WriteReal"
,"WriteLn"
,"DEC"
,"INC"
,"INCL"
,"EXCL"
,"NEW"
,"DISPOSE"
,"HALT"
,"ABS"
,"CAP"
,"ParametroChar"
,"CHR"
,"FLOAT"
,"HIGH"
,"MAX"
,"MIN"
,"ODD"
,"ORD"
,"SIZE"
,"TRUNC"
,"VAL"
,"END_OF_SLK_INPUT_"
};

private static String[] Action_name ={"0"

,"_action_FinDeModulo"
,"_action_ComienzoDeModulo"
,"_action_ListaImportados"
,"_action_ListaExportados"
,"_action_finDeAmbito"
,"_action_DefinicionDeTipo"
,"_action_AsociacionConstante"
,"_action_EsquemaDeTipo_TipoFormacion"
,"_action_TipoSimple_TipoEnumerado"
,"_action_TipoEnumerado"
,"_action_TipoConjunto"
,"_action_TipoFormacion"
,"_action_TipoPuntero"
,"_action_ponerMarcaListaVariables"
,"_action_quitarMarcaListaVariables"
,"_action_DeclaracionVariables"
,"_action_InicioDeclaracionProcedure"
,"_action_CabeceraDeProcedure"
,"_action_por_referencia"
,"_action_ParteEjecutiva"
,"_action_SecuenciaDeSentencias2"
,"_action_SecuenciaDeSentencias"
,"_action_SentenciaAsignacion"
,"_action_RestoSentenciaAsignacion"
,"_action_RestoSentenciaRestoAsignacion_1"
,"_action_RestoSentenciaRestoAsignacion_2"
,"_action_ParteIzquierda_1"
,"_action_ParteIzquierda_2"
,"_action_ParteIzquierda_3"
,"_action_IdentificadorOProcPredef_Ident"
,"_action_IdentificadorOProcPredef_ProcPredef"
,"_action_ExpresionIF"
,"_action_SentenciaIF"
,"_action_ExpresionELSIF"
,"_action_RestoSentenciaELSIF"
,"_action_RestoSentenciaELSE"
,"_action_RestoSentenciaIF"
,"_action_ExpresionWHILE"
,"_action_SentenciaWHILE"
,"_action_ExpresionREPEAT"
,"_action_SentenciaREPEAT"
,"_action_SentenciaLOOP"
,"_action_IdentificadorFOR"
,"_action_ExpresionTO"
,"_action_ExpresionConstanteFOR"
,"_action_SentenciaFOR"
,"_action_Cadena"
,"_action_Caracter"
,"_action_expresionSinParentesisDeSuma"
,"_action_operadorUnario"
,"_action_expresionSinParentesisDeMultiplicacion"
,"_action_OperadorBooleano"
,"_action_TipoFormal"
,"_action_NumeroEntero"
,"_action_NumeroReal"
,"_action_TipoPredefinidoPorUsuario"
,"_action_BITSET"
,"_action_BOOLEAN"
,"_action_CARDINAL"
,"_action_CHAR"
,"_action_INTEGER"
,"_action_LONGINT"
,"_action_LONGREAL"
,"_action_PROC"
,"_action_REAL"
,"_action_TRUE"
,"_action_FALSE"
,"_action_NIL"
};

private static String[] Production_name ={"0"

,"UnidadDeCompilacion --> ModuloPrograma"
,"UnidadDeCompilacion --> ModuloDefinicion"
,"UnidadDeCompilacion --> ModuloImplementacion"
,"ModuloPrograma --> CabeceraModulo Bloque Identificador . _action_FinDeModulo"
,"ModuloDefinicion --> CabeceraDefinicion DefinicionDeModulo_* END Identificador . _action_FinDeModulo"
,"ModuloImplementacion --> IMPLEMENTATION ModuloPrograma"
,"CabeceraModulo --> MODULE Identificador _action_ComienzoDeModulo Prioridad_opt ; ListaImportados_;_*"
,"CabeceraDefinicion --> DEFINITION MODULE Identificador _action_ComienzoDeModulo ; ListaImportados_;_2_* ListaExportados_;_opt"
,"ListaImportados --> FROM_Identificador_opt IMPORT IdentDeProc ,_IdentDeProc_*"
,"ListaExportados --> EXPORT QUALIFIED_opt ListaDeIdentificadores _action_ListaExportados"
,"Prioridad --> ExpresionConstante"
,"Bloque --> ParteDeclarativa ParteEjecutiva END _action_finDeAmbito"
,"DefinicionDeModulo --> DeclaracionDeConstantes"
,"DefinicionDeModulo --> TYPE Identificador_=_EsquemaDeTipo_opt_;_*"
,"DefinicionDeModulo --> DeclaracionDeVariables"
,"DefinicionDeModulo --> CabeceraSubprograma ;"
,"ParteDeclarativa --> Declaracion_*"
,"Declaracion --> DeclaracionDeConstantes"
,"Declaracion --> DeclaracionDeTipos"
,"Declaracion --> DeclaracionDeVariables"
,"Declaracion --> DeclaracionSubprograma"
,"Declaracion --> DeclaracionModulo"
,"DeclaracionDeConstantes --> CONST AsociacionConstante_;_*"
,"AsociacionConstante --> Identificador = ExpresionConstante _action_AsociacionConstante"
,"DeclaracionDeTipos --> TYPE DefinicionDeTipo_;_*"
,"DefinicionDeTipo --> Identificador = EsquemaDeTipo _action_DefinicionDeTipo"
,"EsquemaDeTipo --> TipoSimple"
,"EsquemaDeTipo --> TipoConjunto"
,"EsquemaDeTipo --> TipoFormacion _action_EsquemaDeTipo_TipoFormacion"
,"EsquemaDeTipo --> TipoRegistro"
,"EsquemaDeTipo --> TipoPuntero"
,"EsquemaDeTipo --> TipoSubprograma"
,"TipoSimple --> TipoEnumerado _action_TipoSimple_TipoEnumerado"
,"TipoSimple --> IdentificadorDeTipo RestoDeTipo"
,"TipoSimple --> [ ExpresionConstante .. ExpresionConstante ]"
,"TipoEnumerado --> ( ListaDeIdentificadores ) _action_TipoEnumerado"
,"RestoDeTipo -->"
,"RestoDeTipo --> [ ExpresionConstante .. ExpresionConstante ]"
,"TipoConjunto --> SET OF TipoSimple _action_TipoConjunto"
,"TipoFormacion --> ARRAY TipoSimple ,_TipoSimple_* OF EsquemaDeTipo _action_TipoFormacion"
,"TipoRegistro --> RECORD SecuenciaDeListasDeCampos END"
,"SecuenciaDeListasDeCampos --> ListaDeCampos ;_ListaDeCampos_*"
,"ListaDeCampos -->"
,"ListaDeCampos --> ListaDeIdentificadores : EsquemaDeTipo"
,"TipoPuntero --> POINTER TO EsquemaDeTipo _action_TipoPuntero"
,"TipoSubprograma --> PROCEDURE ListaDeTiposFormales_opt"
,"ListaDeTiposFormales --> ( VAR_opt_TipoFormal_,_VAR_2_opt_TipoFormal_*_opt ) RetornoSubprograma"
,"RetornoSubprograma -->"
,"RetornoSubprograma --> : IdentificadorDeTipo"
,"DeclaracionDeVariables --> VAR _action_ponerMarcaListaVariables ListaDeVariables_;_*"
,"ListaDeVariables --> ListaDeIdentificadores : EsquemaDeTipo _action_DeclaracionVariables"
,"DeclaracionSubprograma --> CabeceraSubprograma ; Bloque Identificador ;"
,"CabeceraSubprograma --> PROCEDURE Identificador _action_InicioDeclaracionProcedure ParametrosFormales_opt"
,"ParametrosFormales --> ( GrupoDeParametros_;_GrupoDeParametros_*_opt ) :_IdentificadorDeTipo_opt"
,"GrupoDeParametros --> VAR_3_opt ListaDeIdentificadores : TipoFormal"
,"DeclaracionModulo --> MODULE Identificador _action_ComienzoDeModulo Prioridad_2_opt ; ListaImportados_;_3_* ListaExportados_;_2_opt Bloque Identificador ; _action_FinDeModulo"
,"ParteEjecutiva --> BEGIN_SecuenciaDeSentencias_opt"
,"SecuenciaDeSentencias --> Sentencia ;_Sentencia_*"
,"Sentencia -->"
,"Sentencia --> SentenciaAsignacion"
,"Sentencia --> SentenciaIF"
,"Sentencia --> SentenciaCASE"
,"Sentencia --> SentenciaWHILE"
,"Sentencia --> SentenciaREPEAT"
,"Sentencia --> SentenciaLOOP"
,"Sentencia --> SentenciaFOR"
,"Sentencia --> SentenciaWITH"
,"Sentencia --> LlamadaProcedimientoPredefinido"
,"Sentencia --> SentenciaRETURN"
,"Sentencia --> EXIT"
,"SentenciaAsignacion --> Identificador RestoSentenciaAsignacion _action_SentenciaAsignacion"
,"RestoSentenciaAsignacion --> ParteIzquierda RestoSentenciaRestoAsignacion _action_RestoSentenciaAsignacion"
,"RestoSentenciaRestoAsignacion -->"
,"RestoSentenciaRestoAsignacion --> := Expresion _action_RestoSentenciaRestoAsignacion_1"
,"RestoSentenciaRestoAsignacion --> ParametrosDeLlamada _action_RestoSentenciaRestoAsignacion_2"
,"ParteIzquierda -->"
,"ParteIzquierda --> [ ListaDeExpresiones ] ParteIzquierda _action_ParteIzquierda_1"
,"ParteIzquierda --> . IdentificadorOProcPredef ParteIzquierda _action_ParteIzquierda_2"
,"ParteIzquierda --> ^ ParteIzquierda _action_ParteIzquierda_3"
,"IdentificadorOProcPredef --> Identificador _action_IdentificadorOProcPredef_Ident"
,"IdentificadorOProcPredef --> LlamadaProcedimientoPredefinido _action_IdentificadorOProcPredef_ProcPredef"
,"SentenciaIF --> IF Expresion _action_ExpresionIF THEN SecuenciaDeSentencias RestoSentenciaIF END _action_SentenciaIF"
,"RestoSentenciaIF --> ELSIF_Expresion_THEN_SecuenciaDeSentencias_* ELSE_SecuenciaDeSentencias_opt"
,"SentenciaCASE --> CASE Expresion OF Caso |_Caso_* ELSE_SecuenciaDeSentencias_2_opt END"
,"Caso --> ListaDeValores : SecuenciaDeSentencias"
,"SentenciaWHILE --> WHILE Expresion _action_ExpresionWHILE DO SecuenciaDeSentencias END _action_SentenciaWHILE"
,"SentenciaREPEAT --> REPEAT SecuenciaDeSentencias UNTIL Expresion _action_ExpresionREPEAT _action_SentenciaREPEAT"
,"SentenciaLOOP --> LOOP SecuenciaDeSentencias END _action_SentenciaLOOP"
,"SentenciaFOR --> FOR Identificador := Expresion _action_IdentificadorFOR TO Expresion _action_ExpresionTO BY_ExpresionConstante_opt DO SecuenciaDeSentencias END _action_SentenciaFOR"
,"SentenciaWITH --> WITH Identificador ParteIzquierda DO SecuenciaDeSentencias END"
,"SentenciaRETURN --> RETURN Expresion_opt"
,"ListaDeValores --> Valores RestoListaValores"
,"RestoListaValores -->"
,"RestoListaValores --> , Valores RestoListaValores"
,"Valores --> ExpresionConstante RestoValores"
,"RestoValores -->"
,"RestoValores --> .. ExpresionConstante"
,"ExpresionConstante --> ExpresionConstanteSimple OperadorComparador_ExpresionConstanteSimple_opt"
,"ExpresionConstanteSimple --> Signo TerminoConstante OperadorSumador_TerminoConstante_*"
,"TerminoConstante --> FactorConstante OperadorMultiplicador_FactorConstante_*"
,"FactorConstante --> Identificador"
,"FactorConstante --> ConstantePredefinida"
,"FactorConstante --> Numero"
,"FactorConstante --> Cadena _action_Cadena"
,"FactorConstante --> Caracter _action_Caracter"
,"FactorConstante --> ( ExpresionConstante )"
,"FactorConstante --> OperadorUnario FactorConstante"
,"ParametrosDeLlamada --> ( ListaDeExpresiones_opt )"
,"ListaDeExpresiones --> Expresion RestoListaDeExpresiones"
,"RestoListaDeExpresiones -->"
,"RestoListaDeExpresiones --> , Expresion RestoListaDeExpresiones"
,"Expresion --> ExpresionSimple RestoExpresion"
,"RestoExpresion -->"
,"RestoExpresion --> OperadorComparador ExpresionSimple"
,"ExpresionSimple --> Signo Termino RestoExpresionSimple"
,"RestoExpresionSimple -->"
,"RestoExpresionSimple --> OperadorSumador Termino _action_expresionSinParentesisDeSuma RestoExpresionSimple"
,"Signo -->"
,"Signo --> + _action_operadorUnario"
,"Signo --> - _action_operadorUnario"
,"Termino --> Factor RestoTermino"
,"RestoTermino -->"
,"RestoTermino --> OperadorMultiplicador Factor RestoTermino _action_expresionSinParentesisDeMultiplicacion"
,"Factor --> Identificador RestoFactor"
,"Factor --> ConstantePredefinida"
,"Factor --> Numero"
,"Factor --> TipoPredefinido { ListaDeElementos }"
,"Factor --> Cadena _action_Cadena"
,"Factor --> Caracter _action_Caracter"
,"Factor --> ( Expresion )"
,"Factor --> OperadorUnario Factor"
,"Factor --> LlamadaFuncionPredefinida"
,"RestoFactor --> { ListaDeElementos }"
,"RestoFactor --> ParametrosDeLlamada"
,"RestoFactor --> ParteIzquierda"
,"OperadorComparador --> = _action_OperadorBooleano"
,"OperadorComparador --> <> _action_OperadorBooleano"
,"OperadorComparador --> # _action_OperadorBooleano"
,"OperadorComparador --> < _action_OperadorBooleano"
,"OperadorComparador --> <= _action_OperadorBooleano"
,"OperadorComparador --> > _action_OperadorBooleano"
,"OperadorComparador --> >= _action_OperadorBooleano"
,"OperadorComparador --> IN"
,"OperadorSumador --> +"
,"OperadorSumador --> -"
,"OperadorSumador --> OR"
,"OperadorMultiplicador --> *"
,"OperadorMultiplicador --> /"
,"OperadorMultiplicador --> DIV"
,"OperadorMultiplicador --> MOD"
,"OperadorMultiplicador --> &"
,"OperadorMultiplicador --> AND"
,"OperadorUnario --> NOT _action_operadorUnario"
,"OperadorUnario --> ~ _action_operadorUnario"
,"TipoFormal --> ARRAY_OF_opt IdentificadorDeTipo _action_TipoFormal"
,"Numero --> NumeroEntero _action_NumeroEntero"
,"Numero --> NumeroReal _action_NumeroReal"
,"ListaDeElementos --> Elementos_,_Elementos_*_opt"
,"Elementos --> ExpresionConstante .._ExpresionConstante_opt"
,"IdentificadorDeTipo --> TipoPredefinido"
,"IdentificadorDeTipo --> Identificador _action_TipoPredefinidoPorUsuario"
,"TipoPredefinido --> BITSET _action_BITSET"
,"TipoPredefinido --> BOOLEAN _action_BOOLEAN"
,"TipoPredefinido --> CARDINAL _action_CARDINAL"
,"TipoPredefinido --> CHAR _action_CHAR"
,"TipoPredefinido --> INTEGER _action_INTEGER"
,"TipoPredefinido --> LONGINT _action_LONGINT"
,"TipoPredefinido --> LONGREAL _action_LONGREAL"
,"TipoPredefinido --> PROC _action_PROC"
,"TipoPredefinido --> REAL _action_REAL"
,"ConstantePredefinida --> TRUE _action_TRUE"
,"ConstantePredefinida --> FALSE _action_FALSE"
,"ConstantePredefinida --> NIL _action_NIL"
,"ListaDeIdentificadores --> Identificador RestoListaIdentificadores"
,"RestoListaIdentificadores -->"
,"RestoListaIdentificadores --> , Identificador RestoListaIdentificadores"
,"IdentDeProc --> Identificador"
,"IdentDeProc --> IdentDeProcPredef"
,"IdentDeProcPredef --> ALLOCATE"
,"IdentDeProcPredef --> DEALLOCATE"
,"IdentDeProcPredef --> ReadInt"
,"IdentDeProcPredef --> WriteInt"
,"IdentDeProcPredef --> ReadCard"
,"IdentDeProcPredef --> WriteCard"
,"IdentDeProcPredef --> ReadChar"
,"IdentDeProcPredef --> WriteChar"
,"IdentDeProcPredef --> ReadString"
,"IdentDeProcPredef --> WriteString"
,"IdentDeProcPredef --> ReadReal"
,"IdentDeProcPredef --> WriteReal"
,"IdentDeProcPredef --> WriteLn"
,"LlamadaProcedimientoPredefinido --> DEC ( Expresion ,_Expresion_opt )"
,"LlamadaProcedimientoPredefinido --> INC ( Expresion ,_Expresion_2_opt )"
,"LlamadaProcedimientoPredefinido --> INCL ( Expresion , Expresion )"
,"LlamadaProcedimientoPredefinido --> EXCL ( Expresion , Expresion )"
,"LlamadaProcedimientoPredefinido --> NEW ( Expresion )"
,"LlamadaProcedimientoPredefinido --> DISPOSE ( Expresion )"
,"LlamadaProcedimientoPredefinido --> ReadInt ( Expresion )"
,"LlamadaProcedimientoPredefinido --> WriteInt ( Expresion , Expresion )"
,"LlamadaProcedimientoPredefinido --> ReadCard ( Expresion )"
,"LlamadaProcedimientoPredefinido --> WriteCard ( Expresion , Expresion )"
,"LlamadaProcedimientoPredefinido --> ReadChar ( Expresion )"
,"LlamadaProcedimientoPredefinido --> WriteChar ( Expresion )"
,"LlamadaProcedimientoPredefinido --> ReadString ( Expresion )"
,"LlamadaProcedimientoPredefinido --> WriteString ( Expresion )"
,"LlamadaProcedimientoPredefinido --> ReadReal ( Expresion )"
,"LlamadaProcedimientoPredefinido --> WriteReal ( Expresion , Expresion ,_Expresion_3_opt )"
,"LlamadaProcedimientoPredefinido --> WriteLn"
,"LlamadaProcedimientoPredefinido --> HALT"
,"LlamadaFuncionPredefinida --> ABS ( Expresion )"
,"LlamadaFuncionPredefinida --> CAP ( ParametroChar )"
,"LlamadaFuncionPredefinida --> CHR ( Expresion )"
,"LlamadaFuncionPredefinida --> FLOAT ( Expresion )"
,"LlamadaFuncionPredefinida --> HIGH ( Expresion )"
,"LlamadaFuncionPredefinida --> MAX ( IdentificadorDeTipo )"
,"LlamadaFuncionPredefinida --> MIN ( IdentificadorDeTipo )"
,"LlamadaFuncionPredefinida --> ODD ( Expresion )"
,"LlamadaFuncionPredefinida --> ORD ( Expresion )"
,"LlamadaFuncionPredefinida --> SIZE ( IdentificadorDeTipo )"
,"LlamadaFuncionPredefinida --> TRUNC ( Expresion )"
,"LlamadaFuncionPredefinida --> VAL ( IdentificadorDeTipo , Expresion )"
,"DefinicionDeModulo_* --> DefinicionDeModulo DefinicionDeModulo_*"
,"DefinicionDeModulo_* -->"
,"Prioridad_opt --> Prioridad"
,"Prioridad_opt -->"
,"ListaImportados_;_* --> ListaImportados ; ListaImportados_;_*"
,"ListaImportados_;_* -->"
,"ListaImportados_;_2_* --> ListaImportados ; ListaImportados_;_2_*"
,"ListaImportados_;_2_* -->"
,"ListaExportados_;_opt --> ListaExportados ;"
,"ListaExportados_;_opt -->"
,"FROM_Identificador_opt --> FROM Identificador"
,"FROM_Identificador_opt -->"
,",_IdentDeProc_* --> , IdentDeProc ,_IdentDeProc_*"
,",_IdentDeProc_* --> _action_ListaImportados"
,"QUALIFIED_opt --> QUALIFIED"
,"QUALIFIED_opt -->"
,"=_EsquemaDeTipo_opt --> = EsquemaDeTipo _action_DefinicionDeTipo"
,"=_EsquemaDeTipo_opt -->"
,"Identificador_=_EsquemaDeTipo_opt_;_* --> Identificador =_EsquemaDeTipo_opt ; Identificador_=_EsquemaDeTipo_opt_;_*"
,"Identificador_=_EsquemaDeTipo_opt_;_* -->"
,"Declaracion_* --> Declaracion Declaracion_*"
,"Declaracion_* -->"
,"AsociacionConstante_;_* --> AsociacionConstante ; AsociacionConstante_;_*"
,"AsociacionConstante_;_* -->"
,"DefinicionDeTipo_;_* --> DefinicionDeTipo ; DefinicionDeTipo_;_*"
,"DefinicionDeTipo_;_* -->"
,",_TipoSimple_* --> , TipoSimple ,_TipoSimple_*"
,",_TipoSimple_* -->"
,";_ListaDeCampos_* --> ; ListaDeCampos ;_ListaDeCampos_*"
,";_ListaDeCampos_* -->"
,"ListaDeTiposFormales_opt --> ListaDeTiposFormales"
,"ListaDeTiposFormales_opt -->"
,"VAR_opt --> VAR"
,"VAR_opt -->"
,"VAR_2_opt --> VAR"
,"VAR_2_opt -->"
,",_VAR_2_opt_TipoFormal_* --> , VAR_2_opt TipoFormal ,_VAR_2_opt_TipoFormal_*"
,",_VAR_2_opt_TipoFormal_* -->"
,"VAR_opt_TipoFormal_,_VAR_2_opt_TipoFormal_*_opt --> VAR_opt TipoFormal ,_VAR_2_opt_TipoFormal_*"
,"VAR_opt_TipoFormal_,_VAR_2_opt_TipoFormal_*_opt -->"
,"ListaDeVariables_;_* --> ListaDeVariables ; ListaDeVariables_;_*"
,"ListaDeVariables_;_* --> _action_quitarMarcaListaVariables"
,"ParametrosFormales_opt --> ParametrosFormales"
,"ParametrosFormales_opt -->"
,";_GrupoDeParametros_* --> ; GrupoDeParametros ;_GrupoDeParametros_*"
,";_GrupoDeParametros_* -->"
,"GrupoDeParametros_;_GrupoDeParametros_*_opt --> GrupoDeParametros ;_GrupoDeParametros_*"
,"GrupoDeParametros_;_GrupoDeParametros_*_opt -->"
,":_IdentificadorDeTipo_opt --> : IdentificadorDeTipo"
,":_IdentificadorDeTipo_opt --> _action_CabeceraDeProcedure"
,"VAR_3_opt --> VAR _action_por_referencia"
,"VAR_3_opt -->"
,"Prioridad_2_opt --> Prioridad"
,"Prioridad_2_opt -->"
,"ListaImportados_;_3_* --> ListaImportados ; ListaImportados_;_3_*"
,"ListaImportados_;_3_* -->"
,"ListaExportados_;_2_opt --> ListaExportados ;"
,"ListaExportados_;_2_opt -->"
,"BEGIN_SecuenciaDeSentencias_opt --> BEGIN SecuenciaDeSentencias _action_ParteEjecutiva"
,"BEGIN_SecuenciaDeSentencias_opt -->"
,";_Sentencia_* --> ; Sentencia _action_SecuenciaDeSentencias2 ;_Sentencia_*"
,";_Sentencia_* --> _action_SecuenciaDeSentencias"
,"ELSIF_Expresion_THEN_SecuenciaDeSentencias_* --> ELSIF Expresion _action_ExpresionELSIF THEN SecuenciaDeSentencias _action_RestoSentenciaELSIF ELSIF_Expresion_THEN_SecuenciaDeSentencias_*"
,"ELSIF_Expresion_THEN_SecuenciaDeSentencias_* -->"
,"ELSE_SecuenciaDeSentencias_opt --> ELSE SecuenciaDeSentencias _action_RestoSentenciaELSE"
,"ELSE_SecuenciaDeSentencias_opt --> _action_RestoSentenciaIF"
,"|_Caso_* --> | Caso |_Caso_*"
,"|_Caso_* -->"
,"ELSE_SecuenciaDeSentencias_2_opt --> ELSE SecuenciaDeSentencias"
,"ELSE_SecuenciaDeSentencias_2_opt -->"
,"BY_ExpresionConstante_opt --> BY ExpresionConstante _action_ExpresionConstanteFOR"
,"BY_ExpresionConstante_opt -->"
,"Expresion_opt --> Expresion"
,"Expresion_opt -->"
,"OperadorComparador_ExpresionConstanteSimple_opt --> OperadorComparador ExpresionConstanteSimple"
,"OperadorComparador_ExpresionConstanteSimple_opt -->"
,"OperadorSumador_TerminoConstante_* --> OperadorSumador TerminoConstante OperadorSumador_TerminoConstante_*"
,"OperadorSumador_TerminoConstante_* -->"
,"OperadorMultiplicador_FactorConstante_* --> OperadorMultiplicador FactorConstante OperadorMultiplicador_FactorConstante_*"
,"OperadorMultiplicador_FactorConstante_* -->"
,"ListaDeExpresiones_opt --> ListaDeExpresiones"
,"ListaDeExpresiones_opt -->"
,"ARRAY_OF_opt --> ARRAY OF"
,"ARRAY_OF_opt -->"
,",_Elementos_* --> , Elementos ,_Elementos_*"
,",_Elementos_* -->"
,"Elementos_,_Elementos_*_opt --> Elementos ,_Elementos_*"
,"Elementos_,_Elementos_*_opt -->"
,".._ExpresionConstante_opt --> .. ExpresionConstante"
,".._ExpresionConstante_opt -->"
,",_Expresion_opt --> , Expresion"
,",_Expresion_opt -->"
,",_Expresion_2_opt --> , Expresion"
,",_Expresion_2_opt -->"
,",_Expresion_3_opt --> , Expresion"
,",_Expresion_3_opt -->"
};

private static final short   START_SYMBOL = 2049;

public static String  GetSymbolName ( short symbol )
{
  if ( symbol >= START_SYMBOL ) {
      return ( Nonterminal_name [symbol - (START_SYMBOL-1)] );
  } else if ( symbol > 0 ) {
      return ( Terminal_name [ SlkParser.GetTerminalIndex ( symbol ) ] );
  } else {
      return ( Action_name [ -symbol ] );
  }
}

public static String  GetProductionName ( short production_number )
{
  return ( Production_name [production_number] );
}


};
