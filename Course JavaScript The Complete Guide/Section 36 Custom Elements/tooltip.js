//NO SHADOW DOM =========================================================================
class Tooltip1 extends HTMLElement { //Custom elements MUST extend a class
  constructor() {
    super(); //must call super()
    this._tooltipContainer;
    this._tooltipText = 'Default tooltip text';
  }

  connectedCallback() { //called when the element is attached to the DOM
    if (this.hasAttribute('text')) { //Check whether or not to use default value
      this._tooltipText = this.getAttribute('text'); //'text' attribute in the HTML
    }
    const tooltipIcon = document.createElement('span');
    tooltipIcon.textContent = ' (?)';
    tooltipIcon.addEventListener('mouseenter', this._showToolTip.bind(this));
    tooltipIcon.addEventListener('mouseleave', this._hideToolTip.bind(this));
    this.appendChild(tooltipIcon);
  }

  disconnectedCallback() { //called when element is removed from the DOM

  }

  _showToolTip() {
    this._tooltipContainer = document.createElement('div');
    this._tooltipContainer.textContent = this._tooltipText;
    this.appendChild(this._tooltipContainer);
  }

  _hideToolTip() {
    this.removeChild(this._tooltipContainer);
  }
}

//WITH SHADOW DOM =========================================================================
class Tooltip2 extends HTMLElement { //Custom elements MUST extend a class
  constructor() {
    super(); //must call super()
    this._tooltipContainer;
    this._tooltipText = 'Default tooltip text for Tooltip2';
    this.attachShadow({ mode: 'open'}); //Creates shadow DOM

    /* FOR template in HTML file
    const template = document.querySelector('#tooltip-template');
    this.shadowRoot.appendChild(template.textContent.cloneNode('true')); //'true' clones nested elements
    */

    this.shadowRoot.innerHTML = `
      <style>
        div {
          background-color: black;
          color: white;
          position: absolute;
          z-index: 10;
        }

        ::slotted(* or CSS selector) { /*Overridden by styles in light DOM*/
          background-color: red;
        }

        :host { /*Styles entire custom element (also overridden by light DOM)*/
          background: blue
        }
      </style>
      <slot>Undefined Slot Text</slot>
      <span>(??)</span>
    `;
  }

  connectedCallback() { //called when the element is attached to the DOM
    if (this.hasAttribute('text')) { //Check whether or not to use default value
      this._tooltipText = this.getAttribute('text'); //'text' attribute in the HTML
    }
    const tooltipIcon = this.shadowRoot.querySelector('span');
    tooltipIcon.addEventListener('mouseenter', this._showToolTip.bind(this));
    tooltipIcon.addEventListener('mouseleave', this._hideToolTip.bind(this));
    this.shadowRoot.appendChild(tooltipIcon);
    this.style.position = 'relative';
  }

  _showToolTip() {
    this._tooltipContainer = document.createElement('div');
    this._tooltipContainer.textContent = this._tooltipText;
    this.shadowRoot.appendChild(this._tooltipContainer);
  }

  _hideToolTip() {
    this.shadowRoot.removeChild(this._tooltipContainer);
  }
}



//=========================================================================
//customElements.define('tag-name', class)
customElements.define('bl-tooltip1', Tooltip1);
customElements.define('bl-tooltip2', Tooltip2);