package com.appdolusca.ojogodas3runas;

public enum significadoRunas {

    fehu ("Riquezas materiais, ganhos merecidos, sucesso conquistado, fertilidade, bons investimentos, conquistas românticas, objetivos que se concretizam, prosperidade, vitória sobre rivais"),
    uruz ("Sorte, crescimento, perseverança, progresso, amadurecimento"),
    thurizas ("Cautela, avaliar antes de mudar de passo, calma, aviso, proteção divina, importante decisão a ser tomada, observe e esteja atento"),
    ansuz ("Sabedoria, inspiração, atenção aos bons conselhos, mensagens, despertar interno e vida longa"),
    raido ("Viagens, progresso em direção as metas, novas oportunidades, notícias inesperadas e mudanças para melhor"),
    kenaz ("Renovação, novos começos, iluminação, criatividade e estabilidade"),
    gebo ("Associação feliz, união, concordância, bons negocios, equilíbrio mental e físico e harmonia."),
    wunjo ("Bem-estar, evolução positiva, ganho material, alegria e novas energias"),
    fehuinvert ("Atraso nos planos, impasses e derrotas"),
    uruzinvert ("Perdas, negativismo, enfraquecimento, falta de vontade e desânimo"),
    thurizasinvert ("Decisões precipitadas, cautela, parada ao longo do caminho"),
    ansuzinvert ("Falta de comunicação, futilidade e esforços inúteis"),
    raidoinvert ("Rompimento, fracassos e caminhos desagradáveis"),
    kenazinvert ("Perda de status social ou posses, fim de ciclos e perda de conexão com o si"),
    wunjoinvert ("Infelicidade, crises e perdas"),
    hagalaz ("Obstáculos temporários, adiamento de planos, precauções, mudanças impostas para obter autoconhecimento e evitar acontecimentos piores"),
    naudhiz ("Limitações e cautela com os planos, sofrimento para restaurar o equilíbrio"),
    isaz("Concentração, renunciar e demonstrar coragem e sabedoria, obstáculos temporários, paciência"),
    jera ("Recompensas, alegria, resultados não imediatos, fertilidade, gestação, justiça, recompensas"),
    eihwaz ("Proteção, final de um ciclo e recomeço, tenha uma meta e siga o objetivo"),
    perdhro ("Ganhos inesperados, conhecimentos ocultos e espirituais, revelações agradáveis, favorável para jogos de azar"),
    sowilo ("Autoconhecimento, regeneração, sucesso, vitória, realizações"),
    algiz ("Viagens, novos caminhos, alegria, progresso, ação oportuna, sacrifícios feitos de boa vontade trazem vitórias"),
    naudhizinvert ("Grande sofrimento. risco de falência, carência"),
    perdhroinvert ("Desapontamentos, atrasos, traições, revelações de segredos do passado, desfavorável para jogos de azar"),
    algizinvert ("Vulnerabilidade, inquietação e perigos"),
    tiwaz ("Vitória através de luta, coragem, dedicação e companheirismo"),
    berkana ("Renovação, fertilidade, nascimento de um ser ou uma ideia, proteção, crescimento e amadurecimento"),
    ehwaz ("Mudanças, progresso e lealdade"),
    mannaz ("Integridade, clareza interior, cooperação, trabalho em equipe"),
    laguz ("Intuição, imaginação, fluidez das emoções, paranormalidade"),
    inguz ("Realizações, nascimentos, amor e sexualidade"),
    dagaz ("Prosperidade, grandes transformações positivas"),
    othala ("Sabedoria ancestral, domínio, notícias distantes, estabilidade, legado e paz interior"),
    tiwazinvert ("Desânimo, problemas espirituais e desperdício de energia vital"),
    berkanainvert ("Confusão, descrença, rompimentos e carência"),
    ehwazinvert ("Movimento bloqueado, incerteza"),
    mannazinvert ("Falta de fé, sabotagens e inimigos ocultos"),
    laguzinvert ("Pensamentos confusos, enganos e fracassos"),
    othalainvert ("Atrasos, problemas, separações acompanhas de sofrimento, falta de clareza e certeza");










    private final String value;

    significadoRunas(String value) {
        this.value = value;
    }


    public String getValue() {

        return value;

    }


}
