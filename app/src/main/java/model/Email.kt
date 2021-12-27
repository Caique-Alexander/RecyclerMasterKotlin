package model

/**
 *
 * Dezembro, 22 2021
 * @author caiqacarvalho@gmail.com (Caique A. de Carvalho).
 */
data class Email(
    val user: String,
    val subject: String,
    val preview: String,
    val date: String,
    val stared: Boolean,
    val unread: Boolean,
    var selected: Boolean = false
)

class EmailBuilder{
    var user: String = ""
    var subject: String = ""
    var preview: String = ""
    var date: String = ""
    var stared: Boolean = false
    var unread: Boolean = false

    fun build() : Email = Email(user, subject, preview, date, stared, unread, false)
}

fun email(block: EmailBuilder.() -> Unit): Email = EmailBuilder().apply(block).build()

fun fakeEmails(): MutableList<Email> = mutableListOf(
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Olá Caique, você precisa ver esse site para"
        date = "22 dez"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "Um amigo quer que você curta uma Página dele"
        preview = "Fulano convidou você para curtir a sua página"
        date = "22 dez"
        stared = false
    },
    email {
        user = "YouTube"
        subject = "Caique A. de Carvalho acabou de enviar um vídeo"
        preview = "Caique A. de Carvalho enviou ANDROID: GOOGLE MAPS, LOCATION"
        date = "18 dez"
        stared = true
        unread = true
    },
    email {
        user = "Instagram"
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Olá Caique, você precisa ver esse site para"
        date = "10 dez"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Olá Caique, você precisa ver esse site para"
        date = "22 dez"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "Um amigo quer que você curta uma Página dele"
        preview = "Fulano convidou você para curtir a sua página"
        date = "22 dez"
        stared = false
    },
    email {
        user = "YouTube"
        subject = "Caique A. de Carvalho acabou de enviar um vídeo"
        preview = "Caique A. de Carvalho enviou ANDROID: GOOGLE MAPS, LOCATION"
        date = "18 dez"
        stared = true
        unread = true
    },
    email {
        user = "Instagram"
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Olá Caique, você precisa ver esse site para"
        date = "10 dez"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Olá Caique, você precisa ver esse site para"
        date = "22 dez"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "Um amigo quer que você curta uma Página dele"
        preview = "Fulano convidou você para curtir a sua página"
        date = "22 dez"
        stared = false
    },
    email {
        user = "YouTube"
        subject = "Caique A. de Carvalho acabou de enviar um vídeo"
        preview = "Caique A. de Carvalho enviou ANDROID: GOOGLE MAPS, LOCATION"
        date = "18 dez"
        stared = true
        unread = true
    },
    email {
        user = "Instagram"
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Olá Caique, você precisa ver esse site para"
        date = "10 dez"
        stared = false
    }

)