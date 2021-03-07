# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 19-05-resolvendo-conflito-de-dependencias-com-spring-hateoas-e-springfox
git add .
git commit -m "Resolvendo conflito de dependências com Spring HATEOAS e SpringFox"
git push origin 19-05-resolvendo-conflito-de-dependencias-com-spring-hateoas-e-springfox

git checkout master
git merge --no-ff 19-05-resolvendo-conflito-de-dependencias-com-spring-hateoas-e-springfox
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```