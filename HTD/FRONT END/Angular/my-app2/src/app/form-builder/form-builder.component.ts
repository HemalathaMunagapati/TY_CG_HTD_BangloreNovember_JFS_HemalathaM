import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormControl, Validators, FormArray} from '@angular/forms';

@Component({
  selector: 'app-form-builder',
  templateUrl: './form-builder.component.html',
  styleUrls: ['./form-builder.component.css']
})
export class FormBuilderComponent implements OnInit {
  registerForm: FormGroup;
  constructor(private fb: FormBuilder) { }

  ngOnInit() {
    this.registerForm = this.fb.group({
      name: this.fb.control(null, [
        Validators.required,
        Validators.minLength(5)
      ]),
      email: this.fb.control(null, [
        Validators.required,
        Validators.minLength(5),
        Validators.email
      ]),
      password: this.fb.control(null, [
        Validators.required,
        Validators.minLength(5),
        Validators.maxLength(8)
      ]),
      age: this.fb.control(null, [
        Validators.required,
        Validators.minLength(3),
      ]),
      skills: this.fb.array([
        this.getSkill()
      ])

    });
  }


  // to push formControl to  formArray
  getSkill() {
    return new FormControl(null, [Validators.required, Validators.minLength(3)]);
  }
// to push FormControl (skill) to FormArray
  addSkill() {
    this.skills.push(this.getSkill());
  }
// to delete each skill
  deleteSkill(i: number) {
    this.skills.removeAt(i);
  }
// to access name field(FormControl)
  get name(): FormControl {
    return this.registerForm.get('name') as FormControl;
  }
// to access email field(FormControl)
  get email(): FormControl {
    return this.registerForm.get('email') as FormControl;
  }
// to access password field(FormControl)
  get password(): FormControl {
    return this.registerForm.get('password') as FormControl;
  }
// to access age field(FormControl)
  get age(): FormControl {
    return this.registerForm.get('age') as FormControl;
  }
// to access skills Array(FormArray)
  get skills(): FormArray {
    return this.registerForm.get('skills') as FormArray;
  }
// called after submitting form
  submitForm() {
    console.log(this.registerForm.value);
    this.registerForm.reset();
  }


}
