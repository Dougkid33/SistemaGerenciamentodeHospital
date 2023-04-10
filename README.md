# SistemaGerenciamentodeHospital
Um CRUD, para a aula de orientação Objetos, trabalho do semestre
Login(tudo tem q ser logado
<<<<<<< HEAD

=======
>>>>>>> d018c5d3a54d9dbe98f76e54ed226eac2b7d629a
CRUD DE PESSOA -> id, nome, endereço, CPF, telefone, login, senha, tipoUsuario, dataCriacao, dataModificacao
metodo para criar pessoa(sem restrição de criação)
os usuarios podem ser da franquia, de uma unidade da franquia, administrativo, medicos e pacientes (podendo ter logins com "tipos" diferentes)
Cadastrar um dono de franquia manualmente
Ao se cadastrar automaticamente recebe o "tipo" de paciente
o dono da franquia e dono da unidade pode alterar o "tipo" de uma pessoa
<<<<<<< HEAD

CRUD DE MEDICO -> id, pessoa, especialidade, dataCriacao, dataModificacao.
os donos de franquia e donos de unidades da franquia podem cadastrar um novo medico, este medico possui apenas uma especialidade, o medico pode trabalhar em qualquer franquia

CRUD DE FRANQUIA -> id, nome, cnpj, cidade, endereço, responsavel, dataCriacao, dataModificacao.
os donos da franquia irão cadastrar a franquia

CRUD DE UNIDADE DA FRANQUIA -> id, franquia, cidade, endereço, responsavel, dataCriacao, dataModificacao.
os donos da franquia irao cadastrar uma nova unidade

CRUD HORÁRIO AGENDA MÉDICO -> id, dia e horário, estado (vazio, alocado), medico, unidade, dataCriacao, dataModificacao.
Donos da franquia, donos de uma unidade de franquia, administrativos e médicos possuem acesso

CRUD de CONSULTA -> id, horário agenda, paciente, estado (agendada, cancelada, realizada), valor consulta, dataCriacao, dataModificacao.
Donos da franquia, donos de uma unidade de franquia, administrativos, médicos e pacientes podem cadastrar uma consulta

=======
CRUD DE MEDICO -> id, pessoa, especialidade, dataCriacao, dataModificacao.
os donos de franquia e donos de unidades da franquia podem cadastrar um novo medico, este medico possui apenas uma especialidade, o medico pode trabalhar em qualquer franquia
CRUD DE FRANQUIA -> id, nome, cnpj, cidade, endereço, responsavel, dataCriacao, dataModificacao.
os donos da franquia irão cadastrar a franquia
CRUD DE UNIDADE DA FRANQUIA -> id, franquia, cidade, endereço, responsavel, dataCriacao, dataModificacao.
os donos da franquia irao cadastrar uma nova unidade
CRUD HORÁRIO AGENDA MÉDICO -> id, dia e horário, estado (vazio, alocado), medico, unidade, dataCriacao, dataModificacao.
Donos da franquia, donos de uma unidade de franquia, administrativos e médicos possuem acesso
CRUD de CONSULTA -> id, horário agenda, paciente, estado (agendada, cancelada, realizada), valor consulta, dataCriacao, dataModificacao.
Donos da franquia, donos de uma unidade de franquia, administrativos, médicos e pacientes podem cadastrar uma consulta
>>>>>>> d018c5d3a54d9dbe98f76e54ed226eac2b7d629a
CRUD de INFO de CONSULTA -> id, consulta, descricao,  dataCriacao, dataModificacao.
o medico pode registrar informações de um consulta ja relizada e visualizar suas informações
CRUD de PROCEDIMENTO -> id, nome,   consulta, dia e horário, estado (agendada, cancelada, realizada), valor, laudo, dataCriacao, dataModificacao
o medico e o paciente podem visualizar informações a respeito das consultas e procedimentos
CRUD de MOVIMENTO FINANCEIRO -> id, tipo movimento (entrada, saída), franquia, unidade, descritivo movimento (consulta, procedimento, salário funcionário, energia, agua, ...), dataCriacao, dataModificacao.
Donos da franquia, donos de uma unidade de franquia, administrativos podem cadastrar movimento financeiro
A cada consulta/procedimento é gerado uma entrada para a unidade de  franquia.
A cada consulta/procedimento é gerado uma saída para o médico.
O médico ganha 60% do valor da consulta.
O médico 50% do valor do procedimento.
=>O software deve conter um calendário para o ano considerado. Ao final do mês, deverá ser pago o valor de R$1000,00 a administradora + 5% do faturamento total da clínica.
Quem faz ? Donos da franquia, donos de uma unidade de franquia e  administrativos.
Gere um relatório com os dados financeiros mensais da FRANQUIA.
o dono da franquia podera gerar relatorio
Gere um relatório com os dados financeiros mensais das UNIDADES. 
o dono da unidade podera gerar relatorio da unidade
Gere um relatório de consultas e procedimentos de um dado paciente.
o medico e o paciente podem gerar esses relatorios
Gere um relatório dos valores recebidos pelo médico.
o medico pode gerar esse relatorio
    • Perfis
=> ADMINISTRADOR (logado)
Todos os privilégios do software. Esta pessoal tem o privilégio de dono da empresa.

=> Responsável pela Franquia (logado)
Todos os privilégios de uma dada franquia.

=> Administrativo (logado)
Gerencia consultas e procedimentos.

=> MÉDICO (logado)
Gerencia consultas e procedimentos. 
