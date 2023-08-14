package com.stadtwerkefroms.stadtwerkeformsapi.model
import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import java.util.Date


@Entity
@Table(name = "form_entry")
class FormEntry(

    @Column(length = 255)
    var salutation: String,

    @Column(length = 255)
    var firstname: String,

    @Column(length = 255)
    var lastname: String,

    @Column(length = 255)
    var email: String,

    @Column(name = "is_business_customer", nullable = false)
    var isBusinessCustomer: Boolean,

    @Column(name = "is_move_in", nullable = false)
    var isMoveIn: Boolean,

    @Column(name = "is_owner", nullable = false)
    var isOwner: Boolean,

    @ManyToOne(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    var address: Address,

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    var createdAt: Date,

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null)



