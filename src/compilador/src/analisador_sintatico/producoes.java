package compilador.src.analisador_sintatico;

public enum producoes {
    regra_program,
    regra_program_novo,
    regra_body,
    regra_body_novo,
    regra_decl_list,
    regra_decl,
    regra_ident_list,
    regra_type,
    regra_stmt_list,
    regra_stmt,
    regra_stmt_novo,
    regra_assign_stmt,
    regra_if_stmt,
    regra_condition,
    regra_repeat_stmt,
    regra_stmt_suffix,
    regra_while_stmt,
    regra_stmt_prefix,
    regra_read_stmt,
    regra_write_stmt,
    regra_writable,
    regra_expression,
    regra_expression_novo,
    regra_simple_expr,
    regra_simple_expr_novo,
    regra_term,
    regra_term_novo,
    regra_fator_a,
    regra_factor,
    regra_constant;
}