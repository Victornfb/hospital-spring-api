package voll.med.api.medico;

public record DadosListagemMedico(
    String nome,
    String email,
    String crm,
    EnumEspecialidade especialidade
) {

    public DadosListagemMedico(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }

}